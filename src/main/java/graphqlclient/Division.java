package graphqlclient;

import io.aexp.nodes.graphql.annotations.GraphQLProperty;

@GraphQLProperty(name="division")
public class Division {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String id;
    private String description;

}
