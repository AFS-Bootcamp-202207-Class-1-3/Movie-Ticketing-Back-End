package com.cool.movie.service.impl;

import com.cool.movie.dto.movie.MoviePage;
import com.cool.movie.dto.movie.MovieResponse;
import com.cool.movie.dto.movie.MovieWithMessagePage;
import com.cool.movie.entity.Movie;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.mapper.MovieMapper;
import com.cool.movie.repository.MovieRepository;
import com.cool.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * (Movie)
 *
 * @author makejava
 * @since 2022-08-07 22:52:55
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {


    @Resource
    private MovieRepository movieRepository;

    @Autowired
    private MovieMapper movieMapper;

    private static final String REGEX = "\\s+";

    /**
     * findById
     *
     * @param id
     */
    @Override
    public MovieResponse findById(String id) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new NotFoundException(Movie.class.getSimpleName()));
        return movieMapper.toResponses(movie);
    }

    @Override
    public MoviePage findByPage(Integer pageSize, Integer pageNumber) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);
        Page<Movie> moviesFind = movieRepository.findAll(pageRequest);

        MoviePage moviePage = new MoviePage(pageSize
                , pageNumber
                , moviesFind.getTotalPages()
                , (int) moviesFind.getTotalElements()
                , (int) moviesFind.getNumberOfElements()
                , moviesFind.toList()
                .stream()
                .map(movie -> movieMapper.toResponses(movie))
                .collect(Collectors.toList()));
        return moviePage;
    }

    /**
     * findByParam
     *
     * @param movie
     */
    @Override
    public List<Movie> findByParam(Movie movie) {
        return null;
    }

    /**
     * save one
     *
     * @param movie
     */
    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    /**
     * save
     *
     * @param movies
     */
    @Override
    public List<Movie> save(List<Movie> movies) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.movieRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.movieRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id Id
     */
    @Override
    public boolean existsById(String id) {
        return movieRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return movieRepository.count();
    }

    @Override
    public MovieWithMessagePage searchByMessage(Integer pageSize, Integer pageNumber, String searchMessage) {
        String searchSql = getSql(searchMessage);
        return movieRepository.MovieWithMessagePage(pageSize, pageNumber, searchSql);
    }

    private String getSql(String searchMessage) {
        String sql = "select * from movie where ";
        if (searchMessage == null || searchMessage.length() == 0) {
            return sql + "1=2;";
        }
        String[] conditions = searchMessage.split(REGEX);

        for (int i = 0; i < conditions.length; i++) {
            sql += "name like %" + conditions[i] + "%";
            if (i != conditions.length - 1) {
                sql += " or ";
            }
        }
        return sql + ";";
    }
}

