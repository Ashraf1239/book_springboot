package com.book.book.entity;

import com.book.book.base.baseEntity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Author extends baseEntity {


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  @NotNull
  @NotEmpty
  @NotBlank
  private String name;
}
