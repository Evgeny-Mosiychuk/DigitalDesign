package model;

import java.util.List;

public class DocumentVersion {

    private User author;

    private String name;

    private String description;

    private List<CustomFile> files;

    private Priority priority;

    private List<String> type;
}
