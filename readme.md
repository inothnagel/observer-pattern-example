A very basic example of the observer pattern in action for demonstration purposes.

Run with:

```
run.sh
```

Start reading the code at `Main.java`.

When the code is run, the output is:

```
Client: Creating new observable values.
Operand (3): I have been created with a value of 3.
Operand (5): I have been created with a value of 5.
Observer: I am registering myself as an observer.
Operand (3): An observer has registered with me to receive notifications when I change.
Observer: I am registering myself as an observer.
Operand (5): An observer has registered with me to receive notifications when I change.
Observer: I am registering myself as an observer.
Operand (3): An observer has registered with me to receive notifications when I change.
Observer: I am registering myself as an observer.
Operand (5): An observer has registered with me to receive notifications when I change.

Client: Changing value a from 3 to 7.
Operand (3): My value has changed from 3 to 7. I will notify my observers.
Observer: I have been notified of a change to one of my values. My new result is 12.
Observer: I have been notified of a change to one of my values. My new result is 2.

Client: Changing value b from 5 to 9.
Operand (5): My value has changed from 5 to 9. I will notify my observers.
Observer: I have been notified of a change to one of my values. My new result is 16.
Observer: I have been notified of a change to one of my values. My new result is -2.
```


