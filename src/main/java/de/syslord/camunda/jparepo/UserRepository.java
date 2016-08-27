package de.syslord.camunda.jparepo;

public interface UserRepository { // extends CrudRepository<User, Long> {

	User findByName(String name);

}
