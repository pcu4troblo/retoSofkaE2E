package com.sofka.retofront.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VariablesProperty {
    URL_SAUCEDEMO("environments.qa.url");

    private String property;
}
