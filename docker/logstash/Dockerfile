FROM docker.elastic.co/logstash/logstash:7.6.0
RUN rm -f /usr/share/logstash/pipeline/logstash.conf
ADD config/logstash.conf /usr/share/logstash/pipeline/
ADD config/data.txt /usr/share/logstash/
#RUN chown logstash /usr/share/logstash/data.txt
#ADD config/ /usr/share/logstash/config/