
async function loadOpportunities() {
  try {
    const response = await fetch("http://localhost:8081/api/careers");

    if (!response.ok) {
      throw new Error("Unable to fetch career opportunities.");
    }

    const data = await response.json();
    const listDiv = document.getElementById("opportunityList");
    listDiv.innerHTML = "";

    if (data.length === 0) {
      listDiv.innerHTML = "<p>No career opportunities found.</p>";
      return;
    }

    data.forEach(career => {
      const div = document.createElement("div");
      div.className = "career";
      div.innerHTML = `<strong>ID:</strong> ${career.id} <br> <strong>Course:</strong> ${career.courseName}`;
      listDiv.appendChild(div);
    });

  } catch (error) {
    document.getElementById("opportunityList").innerHTML =
      `<p style="color:red;">Error loading opportunities: ${error.message}</p>`;
  }
}

// Get career details by ID
async function getCareerDetails() {
  const id = document.getElementById("careerIdInput").value.trim();

  // Validation: Empty input
  if (id === "") {
    document.getElementById("careerDetails").innerHTML =
      "<p style='color:red'>Please enter a valid Career ID.</p>";
    return;
  }

  try {
    const response = await fetch(`http://localhost:8081/api/careers/${id}`);

    if (!response.ok) {
      document.getElementById("careerDetails").innerHTML =
        "<p style='color:red'>Career not found!</p>";
      return;
    }

    const career = await response.json();
    document.getElementById("careerDetails").innerHTML = `
      <h3>${career.courseName}</h3>
      <p><strong>Duration:</strong> ${career.duration ?? 'Not Available'}</p>
      <p><strong>Description:</strong> ${career.description || 'Not Available'}</p>
      <p><strong>Future Scope:</strong> ${career.futureScope ?? 'Not Available'}</p>
    `;

  } catch (error) {
    document.getElementById("careerDetails").innerHTML =
      `<p style="color:red;">Error fetching details: ${error.message}</p>`;
  }
}

loadOpportunities();
