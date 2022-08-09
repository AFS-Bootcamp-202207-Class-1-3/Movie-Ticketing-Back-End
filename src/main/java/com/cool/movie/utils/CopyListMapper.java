package com.cool.movie.utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import static org.springframework.beans.BeanUtils.copyProperties;

@Component
public class CopyListMapper {
    public <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target) {
        List<T> list = new ArrayList<>();
        sources.forEach(v->{
            T t = target.get();
            copyProperties(v, t);
            list.add(t);
        });
        return list;
    }
}
