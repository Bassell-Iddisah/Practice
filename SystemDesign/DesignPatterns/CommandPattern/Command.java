package SystemDesign.DesignPatterns.CommandPattern;

public interface Command {
    void execute();
    void undo();
    void redo();
}
