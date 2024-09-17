package com.dio.devAPI2024.controller.dto;

import com.dio.devAPI2024.domain.model.Feature;
import com.dio.devAPI2024.domain.model.News;

public record FeatureDto(Long id, String icon, String description) {

    public FeatureDto(Feature model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    public Feature toModel() {
        Feature model = new Feature();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}
