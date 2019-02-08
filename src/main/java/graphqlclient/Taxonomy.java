package graphqlclient;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/*@GraphQLProperty(name="taxonomy", arguments={
@GraphQLArgument(name="type")
})*/
public class Taxonomy {
   private String id;
   
   //private TaxonomyType type;
   
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	/*
	 * public TaxonomyType getType() { return type; }
	 * 
	 * public void setType(TaxonomyType type) { this.type = type; }
	 */
	 
}
