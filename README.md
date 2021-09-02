# demo-stomp
demo-stomp

1. install erlang 
https://www.erlang.org/downloads

2. install rabbitmq
https://www.rabbitmq.com/download.html

3. enable rabbitmq plugins
cd ../sbin/
rabbitmq-plugins enable rabbitmq_stomp
rabbitmq-plugins enable rabbitmq_management

4. add user
rabbitmqctl add_user admin admin
