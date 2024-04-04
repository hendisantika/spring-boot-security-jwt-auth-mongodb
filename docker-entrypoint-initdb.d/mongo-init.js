db.createUser(
    {
        user: "admin",
        pwd: "admin",
        roles: [{role: "userAdminAnyDatabase", db: "admin"},
            {role: "dbAdminAnyDatabase", db: "admin"},
            {role: "readWriteAnyDatabase", db: "admin"}]
    }
)

db = db.getSiblingDB('users');

db.createCollection('role');

db.role.insertMany([
    {name: "ROLE_USER"},
    {name: "ROLE_MODERATOR"},
    {name: "ROLE_ADMIN"},
]);
