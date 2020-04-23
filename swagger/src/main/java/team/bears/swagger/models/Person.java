package team.bears.swagger.models;

import io.swagger.annotations.ApiModelProperty;

public class Person {

    public Long id;
    private String first_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ApiModelProperty(
        value = "first name of the user",
        dataType = "String",
        example = "Kan")
    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

}
