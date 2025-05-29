package dev.flix.controller.response;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MovieResponse {
  Long id;
  String title;
  String description;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  LocalDate releaseDate;
  double rating;
  List<CategoryResponse> categories;
  List<StreamServiceResponse> services;
}
