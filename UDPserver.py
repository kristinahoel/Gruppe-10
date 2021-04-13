__author__ = 'jiayingyu'
# UDPPingerServer.py
# Moduler:
import random
from socket import *

# Lager socketen
serverSocket = socket(AF_INET, SOCK_DGRAM)
# Setter IP-adresse og port-nummer
serverSocket.bind(('', 12000))
print("Started UDP server on port 12000")
while True:
    # Generer et tilfeldig tall mellom 0 og 10
    rand = random.randint(0, 10)
    # Mottar meldingen fra klienten
    message, address = serverSocket.recvfrom(1024)
    # Gjør meldingen den mottar til stor skrift
    message = message.upper()
    # Hvis rand er mindre enn 4, anser vi meldingen som tapt, og det vil time ut
    if rand < 4:
        continue
    # Hvis ikke, svarer serveren
    serverSocket.sendto(message, address)
