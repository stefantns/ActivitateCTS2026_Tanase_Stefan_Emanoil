package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLive implements Webinar{
    private String title;
    private String description;
    private List<String> comments;

    private TransmisiuneLive() {
    }

    public TransmisiuneLive(String title, String description, List<String> comments) {
        this.title = title;
        this.description = description;
        this.comments = new ArrayList<>(comments);
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public List<String> getComments() {
        return this.comments;
    }

    @Override
    public void addComment(String comment) {
        this.comments.add(comment);
    }

    public TransmisiuneLive copiaza(){
        TransmisiuneLive newTransmission = new TransmisiuneLive();
        newTransmission.title = this.title;
        newTransmission.description = this.description;
        newTransmission.comments = new ArrayList<>(this.comments);
        return newTransmission;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransmisiuneLive{");
        sb.append("title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", comments=").append(comments);
        sb.append('}');
        return sb.toString();
    }
}
