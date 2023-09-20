package org.example.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Calendario {

    private LocalDateTime data;

    public Calendario(LocalDateTime data) {
        this.data = data;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}