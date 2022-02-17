# All the objects that can be written in a Json schema file.

### Object definitions
```json
{
  "object_definitions" : ["schema object here"]
}
```
### Schema Object
```json
{
  "typeName": "ExampleType",
  "relations": ["relation object here"],
  "permissions": ["permission object here"]
}
```
### Relation Object
```json
{
  "name": "exampleName",
  "objectTypes" : ["objectType Object here"]}
```
###ObjectType Object
Constant object type ("TYPE")
```json
{
  "ObjectType": "TYPE",
  "objectName": "exampleType"
}
```
ObjectType based on Relation
```json
{
    "objectType": "RElATION",
    "objectName": "objectName2",
    "relationName": "relationName2"
}
```
ObjectType based on Permission
```json
{
  "objectType": "PERMISSION",
  "objectName": "permissionObjectName2",
  "permissionName": "testPermissionName2"
}
```