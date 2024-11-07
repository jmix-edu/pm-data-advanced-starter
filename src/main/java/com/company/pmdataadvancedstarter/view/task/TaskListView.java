package com.company.pmdataadvancedstarter.view.task;

import com.company.pmdataadvancedstarter.entity.Task;
import com.company.pmdataadvancedstarter.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "tasks", layout = MainView.class)
@ViewController(id = "Task_.list")
@ViewDescriptor(path = "task-list-view.xml")
@LookupComponent("tasksDataGrid")
@DialogMode(width = "64em")
public class TaskListView extends StandardListView<Task> {
}