package by.stormnet.automation.core.utils;

public enum PauseLength {
    MAX(120),
    MIN(5),
    AJAX(10),
    AVG(30);

    private Integer value;

   PauseLength(Integer value) {
        this.value = value;
    }

    public Integer value(){
        return this.value;
    }
}
