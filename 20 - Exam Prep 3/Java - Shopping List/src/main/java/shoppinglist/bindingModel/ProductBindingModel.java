package shoppinglist.bindingModel;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class ProductBindingModel {

    private int priority;

    @NotNull
    private String name;


    private int quantity;

    @NotNull
    private String status;

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
