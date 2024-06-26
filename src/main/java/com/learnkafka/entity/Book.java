package com.learnkafka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Book {
   @Id
   private Integer bookId;

   private String bookName;

   private String bookAuthor;

   @OneToOne
   @JoinColumn(name = "libraryEventId")
   private LibraryEvent libraryEvent;
}
