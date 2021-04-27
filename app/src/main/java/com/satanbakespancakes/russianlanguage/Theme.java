package com.satanbakespancakes.russianlanguage;

public class Theme {
    private String name;
    private String rule;

    public Theme(String name, String rule) {
        this.name = name;
        this.rule = rule;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
