public class User {
    //Invoker
    private Command start;
    private Command download;
    private Command save;
    private Command exit;
    private Command menuReturn;

    public User(Command start, Command download, Command save, Command exit, Command menuReturn) {
        this.start = start;
        this.download = download;
        this.save = save;
        this.exit = exit;
        this.menuReturn = menuReturn;
    }

    public Command getMenuReturn() {
        return menuReturn;
    }

    public void setMenuReturn(Command menuReturn) {
        this.menuReturn = menuReturn;
    }

    public void start() {
        start.execute();
    }

    public void save() {
        save.execute();
    }

    public void download() {
        download.execute();
    }

    public void exit() {
        exit.execute();
    }

    public void menuReturn() {
        menuReturn.execute();
    }

}

