# User Registration kata

## Goal
Create the functionality using Unit tests and test doubles.

## Requirements
Part 1
- Validate that the user is persisted
- A userId is randomly generated

Part 2
- It cannot exist two users with the same email
- The password should meet security requirements
  - Have more than 8 characters
  - Contains an underscore
- Sends a confirmation email when the user is registered

## Remember
- Write a failing test.
- Write the minimum amount of code to make it pass.
- Do not forget to refactor the code.

### Example of mock

	@Test
	public void should_interact_with_the_mock() {
		Collaborator collaborator = mock(Collaborator.class);		
		MyClass myClass = new MyClass(collaborator);
		
		myClass.run();
		
		verify(collaborator).collaborate();
	}
	
### Example of stub

	@Test
	public void should_retrieve_the_stub_response(){
		Collaborator collaborator = mock(Collaborator.class);		
		String collaboratorResponse = "collaborator response";
		when(collaborator.collaborate()).thenReturn(collaboratorResponse);
		MyClass myClass = new MyClass(collaborator);
		
		String result = myClass.run();
		
		assertEquals(result, collaboratorResponse);
	}

## Authors
Luis Rovirosa [@luisrovirosa](https://www.twitter.com/luisrovirosa)

Jordi Anguela [@jordianguela](https://www.twitter.com/jordianguela)
