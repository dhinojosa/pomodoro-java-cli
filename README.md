# Pomodoro Java CLI Capstone Application

Run
```java
mvn clean verify
```


See if you can extend from what we have done.
Treat this like a morning crossword or sudoku, 
and solve small problems one problem at a time.

Here is Hema's idea of classes that should be done:

```java
class Backlog {
    private List<Task> tasks;
      
    public Backlog() {
      this.tasks = new ArrayList<Tasks>();
    }
  
    public void addTask(Task task) {
       this.tasks.add(task); 
    }
  
    public List<Task> getAll() {
       return tasks; 
    }
}

class Completed {
    private List<Task> tasks
      
    public Backlog() {
      this.tasks = new ArrayList<Tasks>();
    }
  
    public void addTask(Task task) {
       this.tasks.add(task); 
    }
}

class Task implements Comparable<Task> {
    private String description;
    private ZonedDateTime createdDate;
    
    //getters
    //equals
    //hashCode
    //compare
}

class TimeManagementService {
    public TimeManagement(Backlog backlog, Completed completed) {
        this.backlog = backlog;
        this.completed = completed;
    }
  
    public completeTask(Task task) {
        this.backlog.remove(task);
        this.completed.add(task);
    }
}
```
