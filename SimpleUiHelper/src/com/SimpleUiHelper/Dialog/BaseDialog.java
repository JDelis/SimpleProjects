package com.SimpleUiHelper.Dialog;

public abstract class BaseDialog {
    protected String message;
    protected String title;
    protected Boolean isModal = false;

    public BaseDialog(String message, String title) {
        this.message = message;
        this.title = title;
    }

    public BaseDialog(String message, String title, Boolean isModal) {
        this.message = message;
        this.title = title;
        this.isModal = isModal;
    }

    public abstract void show();
}
