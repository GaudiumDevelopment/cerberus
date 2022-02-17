package me.superbiebel.schema;

import com.fasterxml.jackson.databind.JsonNode;

import javax.validation.constraints.NotNull;
import java.util.Map;

public class ObjectSchema {
    public final JsonNode rootObjectNode;
    
    public ObjectSchema(@NotNull JsonNode rootObjectNode) {
        this.rootObjectNode = rootObjectNode;
    }
    private void generateAllRelations(JsonNode objectNode, Map<String, >) {
    
    }
}
