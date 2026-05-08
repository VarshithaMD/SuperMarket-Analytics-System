package com.supermarket.analytics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    private String id;
    private String productId;
    private int quantitySold;
    private LocalDate saleDate; // Date of the sale
    private double totalAmount; // Total amount for this sale item
}