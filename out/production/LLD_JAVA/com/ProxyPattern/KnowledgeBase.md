Proxy Pattern are helpful for no of reasons

Typically they have
1. Client
2. Proxy Layer/ Layers
3. Server / Data Access

Client <================> Proxy Layer/s <=============> Server

ex: 
1. pre-process payload or request sent to the Server
2. post-process payload or response to the Client
3. use as a filter for access restrictions like the one used in this class files

Note: There could be proxy chains and not just a single layer of proxy
