package co.com.client.project.model.dto;

import java.lang.reflect.Array;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class EnumUtils {

    private EnumUtils() {
    }

    public static <T, E extends Enum<E>> Function<T, E> lookupMap(Class<E> aClass, Function<E, T> mapper) {
        @SuppressWarnings("unchecked")
        E[] emptyArray = (E[]) Array.newInstance(aClass, 0);
        return lookupMap(EnumSet.allOf(aClass).toArray(emptyArray), mapper);
    }

    private static <T, E extends Enum<E>> Function<T, E> lookupMap(E[] values, Function<E, T> mapper) {
        Map<T, E> index = new HashMap<>();
        for (E value : values) {
            index.put(mapper.apply(value), value);
        }
        return index::get;
    }
}