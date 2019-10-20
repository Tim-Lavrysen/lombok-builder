# lombok-builder

A test-class-builder made with lombok to build single and multiple pojo's with default values.

Solutions:
 - No @builder in pojo's/entities
 - Default values defined only in builder class
 - Static import @builder (by default this not possible due to a Javac bug)

Key classes:
 - Builder classes for a single pojo: be.tim.single_pojo.UserBuilder
 - Builder classes for multiple pojo's: be.tim.multiple_pojo.UserWithAFriendBuilder which includes the FriendBuilder
 
