package com.dlsc.gemsfx.rtf;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public abstract class RTTableContainer<SELF extends RTTableContainer> extends RTElement<SELF> {

    private final ObservableList<RTTableRow> rows = FXCollections.observableArrayList();


    public SELF withRows(RTTableRow... row) {
        rows.setAll(row);
        return (SELF) this;
    }

    public ObservableList<RTTableRow> getRows() {
        return rows;
    }
}
