package com.dinhle.microservice.product.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public record ProductRequest(String id, String name, String description, BigDecimal price) {

}
