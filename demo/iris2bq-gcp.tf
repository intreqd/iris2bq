// Create the GCP Project
resource "google_project" "gcp_project" {
  name = "IRIS 2 Big Query Demo"
  project_id = "iris2bq-demo"
  // You'll need this
  org_id     = "1234567"
}

// Enable the APIS
resource "google_project_services" "gcp_project_apis" {
  project = "iris2bq-demo"
  services   = ["bigquery.googleapis.com", "storage.googleapis.com"]
}