package com.miniproject.dto;

import com.miniproject.entity.ProductEntity;

import lombok.Data;

@Data
public class ProductDto {
    private String ProdId; // 제품식별코드
    private String ProdNm; // 제품명
    private String ProdPrice; // 제품가격
    private String ProdInfo; // 제품 정보
    private String ProdSales; // 제품 판매량
    private String ProdCategory; // 제품 카테고리
    private String ProdSize; // 제품 사이즈
    private String ProdStock; // 제품 재고량
    private String ProdColor; // 제품 색상

    public static ProductDto toProductDto(ProductEntity productEntity) {

        ProductDto productDto = new ProductDto();

        productDto.setProdId(productEntity.getProdId());
        productDto.setProdNm(productEntity.getProdNm());
        productDto.setProdPrice(productEntity.getProdPrice());
        productDto.setProdInfo(productEntity.getProdInfo());
        productDto.setProdSales(productEntity.getProdSales());
        productDto.setProdCategory(productEntity.getProdCategory());
        productDto.setProdSize(productEntity.getProdSize());
        productDto.setProdStock(productEntity.getProdStock());
        productDto.setProdColor(productEntity.getProdColor());

        return productDto;

    }
}
