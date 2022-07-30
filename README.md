# ReUse-component

you can deploy the component of the job manager by implementing job manager interface into your own service application and then you can extend your implementation in your other services

<h2>provided interface: </h2>
<h3> 1- serveJobs: it take any object as a job and then run using the help of multithreding </h3>
<h3> 2- setNumberOfParallelJobs:  it sets the number of parallel jobs in the multithred</h3>
<h3> 3- return all the job results </h3>

<h2>requiered interface: </h2>

<h3> Thread interface</h2>
