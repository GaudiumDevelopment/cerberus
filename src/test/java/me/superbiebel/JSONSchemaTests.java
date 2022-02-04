package me.superbiebel;

import io.quarkus.test.junit.QuarkusTest;
import me.superbiebel.schema.SchemaFile;
import me.superbiebel.schema.exceptions.InvalidJsonSchemaException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class JSONSchemaTests {
    
    @ParameterizedTest
    @CsvFileSource(resources = {"/testpermissions/testPermissionsObjectCountResult.csv"})
    void ObjectDefinitionCountTest( final String resourcePath, final int result) throws IOException, InvalidJsonSchemaException {
        SchemaFile schemaFile = new SchemaFile(Utils.getResourceAsFile(resourcePath));
        assertEquals(result, schemaFile.getObjectSchemas().size());
    }
}
