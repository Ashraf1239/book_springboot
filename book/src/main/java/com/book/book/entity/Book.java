package com.book.book.entity;

import com.book.book.base.baseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Book extends baseEntity {
  @NotNull(message = "Should enter the name of the book")

  @NotEmpty
  @NotBlank
  private String name;
  @Min(value = 5,message = "the price should be above 5 pound")
  private double price;

  public double getDiscound() {
    return price * 0.25;
  }

  public void setDiscound(double discound) {
    this.discound = discound;
  }

  @Transient
  private double discound;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }
  @NotNull
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "author_id")
  private Author author;
}
