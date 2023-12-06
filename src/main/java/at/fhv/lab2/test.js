fetch('http://localhost:8081/aaa')
  .then(response => response.json())
  .then(data => {
    console.log("received");
    console.log(data);
  })
  .catch(error => console.error('Fehler:', error));
