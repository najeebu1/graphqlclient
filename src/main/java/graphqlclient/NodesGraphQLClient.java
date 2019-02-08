package graphqlclient;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import io.aexp.nodes.graphql.Argument;
import io.aexp.nodes.graphql.Arguments;
import io.aexp.nodes.graphql.GraphQLRequestEntity;
import io.aexp.nodes.graphql.GraphQLResponseEntity;
import io.aexp.nodes.graphql.GraphQLTemplate;

public class NodesGraphQLClient {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws RuntimeException, MalformedURLException {
		GraphQLTemplate graphQLTemplate = new GraphQLTemplate();
		GraphQLRequestEntity requestEntityForPart = GraphQLRequestEntity.Builder()
				  .url("https://ejsiff5mb5h6be7kh626tcjnva.appsync-api.us-east-1.amazonaws.com/graphql")
				  .headers(getHeaders())
				  .request(Part.class)
				  .arguments(new Arguments("part", 
						  new Argument<String>("id", "2tq5bbp99d-0071-257")))
				  .build();
				GraphQLResponseEntity<Part> responseEntity = graphQLTemplate.query(requestEntityForPart, Part.class);
				System.out.println("The partnumber is ...."+responseEntity.getResponse().getNumber() + "\r");
				System.out.println("The partnumber is ...."+responseEntity.getResponse().getTitle() + "\r");
				System.out.println("The partnumber is ...."+responseEntity.getResponse().getDivision().getId() + "\r");
				System.out.println("The partnumber is ...."+responseEntity.getResponse().getSourceId() + "\r");
				
				
				GraphQLRequestEntity requestEntityForModel = GraphQLRequestEntity.Builder()
						  .url("https://ejsiff5mb5h6be7kh626tcjnva.appsync-api.us-east-1.amazonaws.com/graphql")
						  .headers(getHeaders())
						  .request(Model.class)
						  .arguments(new Arguments("model", new Argument<String>("id", "180ee57dp7-000582")))
						  .build();
						GraphQLResponseEntity<Model> responseEntityForModel = graphQLTemplate.query(requestEntityForModel, Model.class);		
						System.out.println("The modelnumber is ...."+responseEntityForModel.getResponse() + "\r");
 
						System.out.println("The modelnumber is ...."+responseEntityForModel.getResponse().getNumber() + "\r");
						System.out.println("The model brand id is ...."+responseEntityForModel.getResponse().getBrand().getId() + "\r");
						System.out.println("The model category id is ...."+responseEntityForModel.getResponse().getCategories() + "\r");
				
	}

	private static Map<String, String> getHeaders() {
		Map<String, String> headersMap = new HashMap<String, String>();
		headersMap.put("x-api-key", "da2-7f2rnxpewbbgxjxwoodmv7hrhe");
		headersMap.put("Content-Type", "application/graphql");
		return headersMap;
	}
	

}
