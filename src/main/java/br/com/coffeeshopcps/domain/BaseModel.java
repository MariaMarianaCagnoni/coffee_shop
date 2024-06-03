package br.com.coffeeshopcps.domain;

import java.time.LocalDateTime;

public interface BaseModel<T>{

    T safeUpdateInfo(T entity);

    void setCreatedAt(LocalDateTime createdAt);
}
