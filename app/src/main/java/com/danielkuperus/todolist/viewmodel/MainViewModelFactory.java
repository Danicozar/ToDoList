package com.danielkuperus.todolist.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.danielkuperus.todolist.model.TaskRepository;

public class MainViewModelFactory implements ViewModelProvider.Factory {

    private TaskRepository taskRepository;

    public MainViewModelFactory(TaskRepository taskRepository) {

        this.taskRepository = taskRepository;

    }
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new MainViewModel(taskRepository);
    }
}
