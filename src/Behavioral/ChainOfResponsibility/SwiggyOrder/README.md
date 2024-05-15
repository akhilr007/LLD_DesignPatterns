# Chain of Responsibility

The Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain. This pattern decouples the sender of a request from its receiver by giving multiple objects a chance to handle the request.

## Structure

The Chain of Responsibility pattern involves the following components:

1. **Handler**: Defines an interface for handling requests and optionally implements the successor link.
2. **Concrete Handler**: Handles requests it is responsible for. Can access its successor to pass the request along the chain.
3. **Client**: Initiates the request to a handler at the beginning of the chain.
