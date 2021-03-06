package no.haagensoftware.datatypes;

public class Talk {
    private String abstractId;
    private String userId;
    private String title;
    private String talkAbstract;
    private String topics;
    private String talkType;
    private String outline;
    private String participantRequirements;
    private String comments;
	
	public Talk() {
		
	}
	
	public String getAbstractId() {
		return abstractId;
	}
	
	public void setAbstractId(String abstractId) {
		this.abstractId = abstractId;
	}

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTalkAbstract() {
        return talkAbstract;
    }

    public void setTalkAbstract(String talkAbstract) {
        this.talkAbstract = talkAbstract;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getTalkType() {
        return talkType;
    }

    public void setTalkType(String talkType) {
        this.talkType = talkType;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getParticipantRequirements() {
        return participantRequirements;
    }

    public void setParticipantRequirements(String participantRequirements) {
        this.participantRequirements = participantRequirements;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
