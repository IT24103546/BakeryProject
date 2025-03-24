document.getElementById("orderForm").addEventListener("submit", function(event) {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const flavor = document.getElementById("flavor").value;
    const size = document.getElementById("size").value;
    const message = document.getElementById("message").value;
    const deliveryDate = document.getElementById("deliveryDate").value;
    const contact = document.getElementById("contact").value;

    alert(`Order placed!\n\nName: ${name}\nFlavor: ${flavor}\nSize: ${size}\nMessage: "${message}"\nDelivery Date: ${deliveryDate}\nContact: ${contact}`);
});
