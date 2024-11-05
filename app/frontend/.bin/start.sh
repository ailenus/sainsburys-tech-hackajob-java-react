
. /projects/app/frontend/.hackajob

echo "[+] Setting the ENV variables..."
BACKEND_APPLICATION_URL=$(curl -X GET --header 'Accept: application/json' --header "Authorization: Bearer $CHE_MACHINE_TOKEN" "$CHE_API_INTERNAL/workspace/$CHE_WORKSPACE_ID?includeInternalServers=false" | jq '.runtime.machines.application.servers.YourBackendApplication.url')

echo "[+] Starting the frontend application..."
cd /projects/app/frontend/
bash -c "export BACKEND_APPLICATION_URL=$BACKEND_APPLICATION_URL && export REACT_APP_BACKEND_APPLICATION_URL=$BACKEND_APPLICATION_URL && $BUILD_AND_RUN"

sleep 10
