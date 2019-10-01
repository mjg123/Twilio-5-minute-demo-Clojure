# Twilio-5-minute-demo-Clojure

Java code for a 5 minute demo of Twilio using Java. There is a class for responding to initial SMS, and a few choices for how to conclude the demo.

## Prep

  - M-x setenv for ACCOUNT_SID and AUTH_TOKEN
  - open eshells for `ring server` and `http`
  - open `M-x term` for ngrok (beware copy&paste out of this needs to use mouse)
  - Open `handler.clj` and the `calls.clj`
  - In `calls.clj`, `M-x cider-jack-in`

## Part 1

  - Show https://raw.githubusercontent.com/mjg123/Twilio-5-minute-demo-Clojure/master/twilio-messaging-api.png
  - Purchase a phone number
  - Show `handler.clj`
  - Add the code for responding to SMS (using `hiccup/html`)
  - Run & test from localhost
  - Explain ngrok and start `ngrok http 3000`
  - Ask people to send an SMS (any message), whoop when they get a reply
  
## Part 2

  - Open the `calls.clj`, check repl `M-C-x` stuff is working
  - Build up the code
  - Add the `/call` endpoint in handler.clj `[:Response [:Say ...] [:Play ...]]`
  - Run the code
  - Done!
