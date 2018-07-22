package structural.facade;

public class Facade {
    public void showProject(String title, String... todos) {
        Project project = new Project(title);
        for(String todo : todos) {
            project.addToDo(new Todo(todo));
        }
    }

}
