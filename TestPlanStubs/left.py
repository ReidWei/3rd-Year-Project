//left
import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BOARD)

IN1 = 11
IN2 = 12
IN3 = 13
IN4 = 15

GPIO.setup(IN1,GPIO.OUT)
GPIO.setup(IN2,GPIO.OUT)
GPIO.setup(IN3,GPIO.OUT)
GPIO.setup(IN4,GPIO.OUT)

GPIO.output(IN1,False)
GPIO.output(IN2,False)
GPIO.output(IN3,GPIO.HIGH)
GPIO.output(IN4,GPIO.LOW)

time.sleep(2)
GPIO.cleanup()