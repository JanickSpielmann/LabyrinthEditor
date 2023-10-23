package gibb.bedag.labyrintheditor.ui.shortcuts;


public enum Shortcut {
    SAVE('s', "Speichere das Labyrinth"),
    LABYRINTH('l', "Zeige das Labyrinth an"),
    MANUAL('m', "Zeige das Handbuch an");

    public final char key;
    public final String definition;

    Shortcut(char key, String definition){
        this.key = key;
        this.definition = definition;
    }

    public static Shortcut parseShortcut(char key){
        for(Shortcut shortcut : values()){
            if(shortcut.key == key) return shortcut;
        }
        throw new IllegalArgumentException("Unexpected value: " + key);
    }
}
