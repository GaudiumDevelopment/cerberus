package me.superbiebel.schema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import me.superbiebel.schema.exceptions.InvalidJsonSchemaException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Generates the necessary objectschemas for a file and provides a container for them.
 */
public class SchemaFile {
    public final File jsonFile;
    private JsonNode rootjsonNode;
    @Getter
    private final List<ObjectSchema> objectSchemas;
    
    public SchemaFile(File jsonFile) throws IOException, InvalidJsonSchemaException {
        this.jsonFile = jsonFile;
        if(!jsonFile.exists()) {
            throw new FileNotFoundException("Could not find schemaFile");
        }
        this.rootjsonNode = new ObjectMapper().readTree(jsonFile);
        objectSchemas = generateObjectSchemas(this.rootjsonNode);
    }
    private List<ObjectSchema> generateObjectSchemas(JsonNode jsonNode) throws InvalidJsonSchemaException {
        List<ObjectSchema> objectSchemaList = new ArrayList<>();
        JsonNode objectDefinitionsJsonNode = jsonNode.get("object_definitions");
        if (!objectDefinitionsJsonNode.isArray()) {
            throw new InvalidJsonSchemaException("Object_definitions is not an array");
        }
        for (Iterator<JsonNode> it = objectDefinitionsJsonNode.elements(); it.hasNext(); ) {
            JsonNode objectDefinition = it.next();
            objectSchemaList.add(new ObjectSchema(objectDefinition));
        }
        return objectSchemaList;
    }
}
